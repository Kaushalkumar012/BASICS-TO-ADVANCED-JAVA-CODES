let span = document.querySelector(".date_span");
let dateInputs = document.querySelectorAll("input");

// Set end date to today
dateInputs[1].valueAsDate = new Date();

function calculateElapse() {
  const startDate = dateInputs[0].valueAsDate;
  const endDate = dateInputs[1].valueAsDate;

  // Ensure both dates are valid
  if (startDate instanceof Date && endDate instanceof Date && !isNaN(startDate) && !isNaN(endDate)) {
    const elapsedDays = Math.floor((endDate - startDate) / (1000 * 60 * 60 * 24));
    span.textContent = `${elapsedDays} day(s)`;
  } else {
    span.textContent = "Please select both dates.";
  }
}

// Calculate initially in case default date is used
calculateElapse();

// Add event listener
dateInputs.forEach(input => input.addEventListener("change", calculateElapse));
