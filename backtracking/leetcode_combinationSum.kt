class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val n = candidates.size
        val result = mutableSetOf<List<Int>>()

        fun backtrack(list:MutableList<Int>){
            if(list.sum() >= target){
                if(list.sum() == target) result.add(list.sorted().toList())
                return 
            }

            for(i in 0 until n){
                val temp = list
                temp.add(candidates[i])
                backtrack(temp)
                temp.remove(candidates[i])
            }
        }

        backtrack(mutableListOf<Int>())

        return result.toList()
    }
}
