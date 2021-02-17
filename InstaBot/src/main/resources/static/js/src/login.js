$(document).ready(function(){
    var pattern = new RegExp('[a-zA-Z0-9!-_][^()\'`]{8,}$');
    $('#password, #passwordConfirm').on('keyup', function() {
        if ($('#password').val() != '' && $('#passwordConfirm').val() != '' && $('#password').val() == $('#passwordConfirm').val() && pattern.test($('#password').val())) {
            $('.pwds').removeClass('is-invalid');
        } else {
            $('.pwds').addClass('is-invalid');
        }
    });

    let currForm = document.getElementById('sing-up-form');

    currForm.addEventListener('submit', function(event) {
              if (currForm.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              currForm1.classList.add('was-validated');
    }, false);
});