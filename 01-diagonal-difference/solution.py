# Problem: Diagonal Difference
# Topic: 2D Arrays / Matrices
# Time Complexity: O(N) - single pass across N rows
# Space Complexity: O(1) - only two running sum variables used

def diagonalDifference(arr):
    n = len(arr)
    # Primary diagonal: top-left to bottom-right (row == col)
    primary_sum = sum(arr[i][i] for i in range(n))
    # Secondary diagonal: top-right to bottom-left (col == n - 1 - row)
    secondary_sum = sum(arr[i][n - 1 - i] for i in range(n))
    return abs(primary_sum - secondary_sum)

if __name__ == "__main__":
    sample_matrix = [
        [11, 2, 4],
        [4, 5, 6],
        [10, 8, -12]
    ]
    print("Diagonal Difference:", diagonalDifference(sample_matrix))  # Expected: 15