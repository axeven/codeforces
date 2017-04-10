from time import time

def process_input():
    line = input()
    n = int(line.split(' ')[0])
    k = int(line.split(' ')[1])
    map = []
    for i in range(n):
        map.append(input())
    return n, k, map


def compute(n, k, map):
    max_comp_size = 0
    for start_row in range(0, n - k + 1):
        for start_col in range(0, n - k + 1):
            comp_size = k * k
            added_to_queue = [([False] * n) for i in range(n)]
            for row in range(start_row, min(start_row + k, n)):
                for col in range(start_col, min(start_col + k, n)):
                    added_to_queue[row][col] = True
            queue_row = []
            queue_col = []
            for col in range(start_col, min(start_col + k, n)):
                if start_row - 1 >= 0:
                    if map[start_row - 1][col] == '.':
                        queue_row.append(start_row - 1)
                        queue_col.append(col)
                        added_to_queue[start_row - 1][col] = True
                        comp_size += 1
                if start_row + k < n:
                    if map[start_row + k][col] == '.':
                        queue_row.append(start_row + k)
                        queue_col.append(col)
                        added_to_queue[start_row + k][col] = True
                        comp_size += 1
            for row in range(start_row, min(start_row + k, n)):
                if start_col - 1 >= 0:
                    if map[row][start_col - 1] == '.':
                        queue_row.append(row)
                        queue_col.append(start_col - 1)
                        added_to_queue[row][start_col - 1] = True
                        comp_size += 1
                if start_col + k < n:
                    if map[row][start_col + k] == '.':
                        queue_row.append(row)
                        queue_col.append(start_col + k)
                        added_to_queue[row][start_col + k] = True
                        comp_size += 1
            while len(queue_col) > 0:
                next_queue_row = []
                next_queue_col = []
                for i in range(len(queue_col)):
                    x = queue_row[i]
                    y = queue_col[i]
                    if x > 0 and not added_to_queue[x - 1][y] and map[x - 1][y] == '.':
                        next_queue_row.append(x - 1)
                        next_queue_col.append(y)
                        added_to_queue[x - 1][y] = True
                        comp_size += 1
                    if x + 1 < n and not added_to_queue[x + 1][y] and map[x + 1][y] == '.':
                        next_queue_row.append(x + 1)
                        next_queue_col.append(y)
                        added_to_queue[x + 1][y] = True
                        comp_size += 1
                    if y > 0 and not added_to_queue[x][y - 1] and map[x][y - 1] == '.':
                        next_queue_row.append(x)
                        next_queue_col.append(y - 1)
                        added_to_queue[x][y - 1] = True
                        comp_size += 1
                    if y + 1 < n and not added_to_queue[x][y + 1] and map[x][y + 1] == '.':
                        next_queue_row.append(x)
                        next_queue_col.append(y + 1)
                        added_to_queue[x][y + 1] = True
                        comp_size += 1
                queue_row = next_queue_row
                queue_col = next_queue_col
            max_comp_size = max(max_comp_size, comp_size)
    return max_comp_size


if __name__ == '__main__':
    n, k, map = process_input()
    print(compute(n, k, map))
