@main def p7():Unit={
    println(filterEvenNumbers(List(23,45,67,44,12,24)))
    println(calculateSquare(List(1,2,3,4,5)))
    println(filterPrime(List(2,4,5,6,9,17,19)))


}

def filterEvenNumbers(list:List[Int]):List[Int]={
    val filteredList=list.filter((x:Int) => x % 2 ==0 )
    filteredList
}

def calculateSquare(list:List[Int]):List[Int]={
    val squaredList=list.map((x:Int)=>x*x)
    squaredList
}

def filterPrime(list:List[Int]):List[Int]={
    val filteredList=list.filter((x:Int)=> {
        if(x <= 1) false
        else if(x == 2) true
        else !(2 to math.sqrt(x).toInt).exists((y:Int) => x%y == 0)
    })
    filteredList
}