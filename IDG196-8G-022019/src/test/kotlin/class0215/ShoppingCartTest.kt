package class0215

import org.junit.Test
import org.junit.Assert.assertTrue


class ShoppingCartTest {

    private val creditCard = "2123986577091299"
    private val creditCode = "999"
    private val creditExpire = "6/20"

    private val payment = Payment (creditCard, creditCode, creditExpire )
    private val customer = Customer ()


    @Test
    fun `remove payment returns true if payment list is empty`(){
        val customerTraits = CustomerTraits(customer)

    }

    @Test
    fun `can't remove a payment that doesn't exist`(){

    }

    @Test
    fun `can add a new payment if it doesn't exist`(){

    }

}