class Point{
    private _X:number;
    private _Y:number;
    constructor(X:number,Y:number){
        this._X=X;
        this._Y=Y;
    }
    public get X():number{
        return this._X;
    }
    public get Y():number{
        return this._Y;
    }
}
let p1=new Point(10,2);
console.log(p1.X);
console.log(p1.Y);