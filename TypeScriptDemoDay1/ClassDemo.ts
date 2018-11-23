class Car{
    engine:string;

    constructor(engine:string){
        this.engine = engine;
    }

    disp():void{
        console.log("Function dispalys Engine is : " + this.engine);
    }
}

var obj1 = new Car("Honda");

console.log("Resding attribute value Engine as : " + obj1.engine);

obj1.disp();