var Point = /** @class */ (function () {
    function Point(X, Y) {
        this._X = X;
        this._Y = Y;
    }
    Object.defineProperty(Point.prototype, "X", {
        get: function () {
            return this._X;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "Y", {
        get: function () {
            return this._Y;
        },
        enumerable: true,
        configurable: true
    });
    return Point;
}());
var p1 = new Point(10, 2);
console.log(p1.X);
console.log(p1.Y);
