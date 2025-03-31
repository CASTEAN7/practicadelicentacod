document.addEventListener('DOMContentLoaded', () => {
    loadMonths();   // Load months dropdown
//    loadTimes();    // Load available times
    loadCalendar(); // Load the calendar for the current month
});

// Function to load months for the current year
function loadMonths() {
    const monthSelector = document.getElementById('monthSelector');
    const currentMonth = new Date().getMonth();
    const currentYear = new Date().getFullYear();

    for (let month = 0; month < 12; month++) {
        let option = document.createElement('option');
        option.value = month;
        option.textContent = new Date(currentYear, month).toLocaleString('default', { month: 'long' });
        
        // Disable months from previous months in the year
        if (month < currentMonth) {
            option.disabled = true;
        }

        monthSelector.appendChild(option);
    }
}

// Function to generate the calendar grid based on selected month
function loadCalendar() {
    const monthSelector = document.getElementById('monthSelector');
    const selectedMonth = monthSelector.value || new Date().getMonth(); // Default to current month
    const date = new Date();
    date.setMonth(selectedMonth);

    const year = date.getFullYear();
    const month = date.getMonth(); // Get the updated month
    const firstDay = new Date(year, month, 1).getDay(); // First day of the month
    const lastDate = new Date(year, month + 1, 0).getDate(); // Last date of the month

    const calendarDisplay = document.getElementById('calendarDisplay');
    calendarDisplay.innerHTML = ''; // Clear previous calendar grid

    // Add days of the week header
    const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
    daysOfWeek.forEach(day => {
        const dayName = document.createElement('div');
        dayName.classList.add('day-name');
        dayName.textContent = day;
        calendarDisplay.appendChild(dayName);
    });

    // Generate empty slots for days before the first day of the month
    for (let i = 0; i < firstDay; i++) {
        const emptyDay = document.createElement('div');
        emptyDay.classList.add('day');
        calendarDisplay.appendChild(emptyDay);
    }

    // Generate days for the current month
    for (let day = 1; day <= lastDate; day++) {
        const dayElement = document.createElement('div');
        dayElement.classList.add('day');
        dayElement.textContent = day;

        // Disable weekends and past days
        const currentDay = new Date(year, month, day);
        const today = new Date();
        if (currentDay < today || currentDay.getDay() === 0 || currentDay.getDay() === 6) {
            dayElement.classList.add('disabled');
        } else {
            dayElement.addEventListener('click', () => selectDay(dayElement, day));
        }

        calendarDisplay.appendChild(dayElement);
    }
}

// Function to handle day selection
function selectDay(element, day) {
    const selectedDays = document.querySelectorAll('.calendar-display .day.selected');
    selectedDays.forEach(day => day.classList.remove('selected'));
    element.classList.add('selected');
    document.getElementById('calendar').value = `${new Date().getFullYear()}-${new Date().getMonth() + 1}-${day}`;
}

// Function to load available times
//function loadTimes() {
//    let timeSelect = document.getElementById('time');
//    timeSelect.innerHTML = ''; // Clear previous options
//    let startTime = 8 * 60; // 8:00 AM in minutes
//    let endTime = 16 * 60 + 30; // 4:30 PM in minutes
//    for (let i = startTime; i <= endTime; i += 30) {
//        let hours = Math.floor(i / 60);
//        let minutes = i % 60;
//        let formattedTime = `${hours}:${minutes === 0 ? '00' : minutes}`;
//        let option = document.createElement('option');
//        option.value = formattedTime;
//        option.textContent = formattedTime;
//        timeSelect.appendChild(option);
//    }
//}

// Function to disable past days on date picker
function disablePastDays() {
    let today = new Date().toISOString().split('T')[0];
    document.getElementById('calendar').setAttribute('min', today);
}

