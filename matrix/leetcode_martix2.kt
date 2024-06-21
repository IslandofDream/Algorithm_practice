class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        val dx = listOf(1,0,-1,0)
        val dy = listOf(0,1,0,-1)

        val matrix = Array(n){IntArray(n){0}}
        var movement = 0 // 0~3
        var num = 1
        var x = 0
        var y = 0
        matrix[0][0] = 1
    

        while(num < n*n){
            val nextX = x+dx[movement]
            val nextY = y+dy[movement]
            if(nextX in 0 until n && nextY in 0 until n && matrix[nextY][nextX] == 0){
                    x = nextX
                    y = nextY
                    num++
                    matrix[y][x] = num                  
            }else{
                movement++
                if(movement == 4) movement = 0
            }
        }

        return matrix


        
    }
}

