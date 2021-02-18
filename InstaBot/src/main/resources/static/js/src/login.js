$(document).ready(function(){
    var patternPass = new RegExp('[a-zA-Z0-9!-_][^()\'`]{8,}$');
    var patternEmail = new RegExp('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$');
    $('#password, #passwordConfirm').on('keyup', function() {
        if ($('#password').val() != '' && $('#passwordConfirm').val() != '' && $('#password').val() == $('#passwordConfirm').val()) {
            $($('#passwordConfirm')).removeClass('is-invalid');
        } else {
            $($('#passwordConfirm')).addClass('is-invalid');
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

    currForm.querySelectorAll('.form-control').forEach(input => {
        input.addEventListener(('input'), () => {
            if (patternPass.test($('#password').val())) {
                $('#password').removeClass('is-invalid');
            } else {
                $('#password').addClass('is-invalid');
            }
             if (patternEmail.test($('#email').val())) {
                $('#email').removeClass('is-invalid');
             } else {
                $('#email').addClass('is-invalid');
             }
        });
    });
});