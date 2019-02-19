package class0211

import clase0211.ShoppingCar
import org.junit.Test

class ShoppingCartTest {
    private val shoppingCar = ShoppingCar()

    class shopGroceries(val name: String){
        var Nombre = String()//Nombre:
        var Cantidad = String()//Cantidad:
        var Precio = String()//Precio
    }

    class ShopCart(val name:String){
        var CantidadProductos = String()//Cantidad
        var PrecioTotal = String()//Precio Total
    }

    class ShopClient (val name:String){
        var Nombre = String()//Nombre
        var Edad = String()//Edad
        var Correo = String()//
        var Pago = String()//Forma de pago
    }

    class FormaPago (val name:String){
        var Cash = String()
        var TarjetaCredito = String()
        var Cupones = String()
    }

    class ShopTransport (val name:String){
        var Carro = String()//Carro
        var Autobus = String()//Autobus
        var Taxi = String()//Taxi
        var Otro = String()//Otro
    }

}