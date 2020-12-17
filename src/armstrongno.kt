fun main(args: Array<String>) {
    var low=999
    var high=99999

        for (number in low+1.. high-1){
            var digits=0
            var result=0
            var originalNumber=number


            while (originalNumber!=0){
                originalNumber/=10
                ++digits
            }
            originalNumber=number
            while (originalNumber!=0){
                val remainder=originalNumber%10
                result+=Math.pow(remainder.toDouble(),digits.toDouble()).toInt()
                originalNumber/=10
            }
                if (result==number)
                    print("$number ,")


        }
}