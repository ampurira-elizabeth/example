import javax.print.attribute.standard.MediaSize.Other

fun main() {
var P1=CurrentAccount("HELLEN","A23H",3000.0)
    P1.Deposit(200.0)
    P1.withdraw(100.0)
    var p2=Savingsaccount("liz","w44y1`",1200.0,3)
    p2.withdraw(200.0)
    p2.withdraw(100.0)
    println(p2.withdrawals)
var product1=    product("ban",4.1,200.0,"grocery")
var product2=   product("fruit",3.0,100.0,"hygien")
 var product3=  product("cloth",6.0,500.0,"other")
    categorise(product1)
    categorise(product2)
    categorise(product3)
}

 open class CurrentAccount(var accountname:String,var accountnumber:String,var balance:Double){
    fun Deposit(amount:Double){
        balance+=amount
        println(balance)
    }
   open fun withdraw(amount:Double){
        balance-=amount
        println(balance)
    }
fun details(){
    println("Account number $accountnumber with balance $balance is operated by $accountname")
}
}
class Savingsaccount(accountname: String,accountnumber: String,balance: Double, var withdrawals:Int):CurrentAccount(accountname,accountnumber,balance){
    override fun withdraw(amount: Double) {
        if (withdrawals<4) {
            super.withdraw(amount)
            withdrawals++

        }
        else{
            println("your not eligible to withdraw money")
        }
    }
}
//product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category

data class product(var name:String,var weight:Double,var price:Double,var category:String)
fun categorise(Product:product){
    var groceries= mutableListOf<product>()
    var hyginies= mutableListOf<product>()
    var otherp= mutableListOf<product>()
    when (Product.category){
        "grocery"-> groceries.add(Product)
        "hygien"-> groceries.add(Product)
        else ->  otherp.add(Product)


    }
    println(groceries)
    println(otherp)
    println(hyginies)
    }

