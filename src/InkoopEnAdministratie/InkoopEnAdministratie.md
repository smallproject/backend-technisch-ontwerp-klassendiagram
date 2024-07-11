```mermaid
graph TD;
    
    Product-->TV;
    Product-->RemoteControl;
    Product-->CiModule;
    Product-->Beugels;


    TV-->RemoteControl;
    TV-->CiModule;
    TV-->Beugels;    
    
    User

```


```mermaid

    classDiagram


    class User {
        -Id
        -FirstName
        -Lastname
        -BirthDate
        -Address
        -PostCode
        -ContactNo
        -Role
    }
    
    
    class Product {
        -id
        -name
        -priceSold
        -pricePurchase
        -discount
        -sold
        -purchased
        -quantity
        
        getSold(id)
        getQuantity(id)

    }
    
    class TV {
        -Brand
    }    
    
    class CiModule {
        
    }
    
    class Beugels {
        
    }
    
    class RemoteControl {
        
    }
    
    Product --> TV
    Product --> CiModule
    Product --> Beugels
    Product --> RemoteControl


        TV "0..*" -- "0..1" CiModule
        TV "0..*" -- "0..1" Beugels
        TV "0..1" -- "0..1" RemoteControl
    
```