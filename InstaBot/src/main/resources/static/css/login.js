var stomp = null;

// подключаемся к серверу по окончании загрузки страницы
window.onload = function() {
    connectToBucketPage();
};

function connectToBucketPage() {
    var socket = new SockJS('/socket');
    stomp = Stomp.over(socket);
    stomp.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stomp.subscribe('/topic/login', function (login) {
            renderItem(login);
        });
    });
}