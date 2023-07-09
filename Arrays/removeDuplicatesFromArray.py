class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        output = []
        for i in nums:
            if i not in output:
                output.append(i)
        for i in range(len(output)):
            nums[i]=output[i]
        return len(output)