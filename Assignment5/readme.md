## Assignment 5

### Question
1. Uses Generic types to implement a remove duplicates (extending comparable)
<br>
Question (a) and (b) are in one file outputted from single file
<br>
Output is as shown:
<br>
    <code>
        $ java GenericDemo
        <br>
            Question(a) Generic remove duplicates: [14, 24, 42, 25]
        <br>
            Question(b) Non-Generic remove duplicates: [14, 24, 42, 25]
    </code>
2. Using thread and simple lock to access shared resource (balance) and updating it using an anonymous function which extends Runnable
<br>
    <code>
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
            account.PennyTask();
            }
    </code>
<br>
Using this function to call PennyTask to increment balance by 1, using a shared lock to lock out any access to the resource, however due to the nature of Thread, the thread does not wait for the lock.
<br>
Output is as shown:
<br>
    <code>
        $ java chapter30/Test
        <br>
            The Account Balance Before Deposit is 0
        <br>
            The Account Balance Before Deposit is 3
    </code>
<br>
3. Uses Generic types to implement a finding max (extending comparable)
<br>
Question (a) and (b) are in one file outputted from single file
Output is as shown:
<br>
    <code>
        $ java GenericDemo
        <br>
            Generic max: 42
        <br>
            Non-Generic max: 42
    </code>
<br>