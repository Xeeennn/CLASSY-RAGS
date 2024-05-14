function toggleMenu() {
    var menu = document.querySelector('.menu');
    menu.classList.toggle('active');
  }
  
  window.onload = function() {
    var menuToggle = document.querySelector('.menu-toggle');
    menuToggle.style.display = 'block';
  };
  
  document.getElementById('container').style.overflowY = 'auto';

  