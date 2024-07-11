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
        -EmailAddress
        -Role
        
        getRole(id)
        getContactNo(id)
        getEmailAddress(id)
    }
    
    
    class Product {
        <<ABSTRACT>>
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
        -size
        -resolution
        
        getBrand(id);
    }    
    
    class CiModule {
        -provider
        -cam type
        
        getProvider(id);
    }
    
    class Beugels {
        -maxWeight
        -maxSize   
        
        getMaxWeight(id);
    }
    
    class RemoteControl {
        -brand
        
        getBrand(id);
    }
    
    Product --> TV
    Product --> CiModule
    Product --> Beugels
    Product --> RemoteControl


    TV "0..*" -- "0..1" CiModule:has a
    TV "0..*" -- "0..1" Beugels:can have
    TV "0..1" -- "0..1" RemoteControl:has a    
```

## **Functioneel eisen**

Als beheerder wil ik een overzicht van het product inkoop en kosten van inkoop.

Als beheerder wil ik een overzicht van het product verkoop en prijs van verkoop.

Als beheerder wil ik een overzicht van het aantal van het product en het aantal van inkoop.

Als gebruiker wil ik een overzicht van het aantal van product en het verkoop prijs.


Als gebruiker wil ik zien hoe is het product van elkaar verbind.





## Niet Functioneel eisen

Als gebruiker wil ik dat het applicatie snel draait.


Als gebruiker wil ik dat het applicatie altijd beschikbaar is.

Als gebruiker wil ik dat het applicatie op mijn telefoon kan gebruiken.

Als gebruiker wil ik dat het applicatie een dark mode kan stellen.

Als gebruiker wil ik dat het applicatie betrouwbaar is.

Als gebruiker wil ik dat het applicatie veilig is.

Als gebruiker wil ik dat het applicatie gebruikers vriendelijk is.

