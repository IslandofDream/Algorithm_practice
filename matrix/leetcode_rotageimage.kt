class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size

        // 1단계: 행렬 전치
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }

        // 2단계: 각 행을 뒤집기
        for (i in 0 until n) {
            matrix[i].reverse()
        }
    }
}
