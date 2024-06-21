class Solution {
    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        val n = mat.size
        repeat(4){
            for (i in 0 until n){
                for(j in i+1 until n){
                    val temp = mat[i][j]
                    mat[i][j] = mat[j][i]
                    mat[j][i] = temp
                }
            }
            for(i in 0 until n) {
                    mat[i].reverse()
                }
            if(Arrays.deepEquals(mat, target)) return true
        }
        return false
    }
}
