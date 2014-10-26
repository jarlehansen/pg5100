angular.module('testApp', []).service('greetingService', function () {
    this.greeting = function (name) {
        return 'Hello ' + name
    };
});