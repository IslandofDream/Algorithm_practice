class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val dx = listOf(1,0,-1,0)
        val dy = listOf(0,1,0,-1)

        val m = matrix.size
        val n = matrix[0].size
        val result = mutableListOf<Int>()
        val visited = Array(m){BooleanArray(n){false}}
        var movement = 0 // 0~3
        var x = 0
        var y = 0
        visited[0][0] = true
        result.add(matrix[y][x])

        while(result.size < m*n){
            val nextX = x+dx[movement]
            val nextY = y+dy[movement]
            if(nextX in 0 until n && nextY in 0 until m && !visited[nextY][nextX]){
                    x = nextX
                    y = nextY
                    visited[y][x] = true
                    result.add(matrix[y][x])
            }else{
                movement++
                if(movement == 4) movement = 0
            }
        }

        return result
    }
}
