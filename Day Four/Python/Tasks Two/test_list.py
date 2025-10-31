def get_palindrome_flags(lst):
    result = []
    for word in lst:
   
        if word == word[::-1]:
            result.append(True)
        else:
            result.append(False)
    return result


test_list = ["madam", "racecar", "hello", "noon"]
print(get_palindrome_flags(test_list))