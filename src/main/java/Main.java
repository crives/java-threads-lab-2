class Main {
    /*
    You’re given a Pizza class that has methods for each step of cooking the pizza.
    Each of the methods except for the cookPizza method extends the Thread class and
    overrides the run method.

The cookPizza method is not giving the expected output.
Your task is to fix it so that the output looks like the following:

cook base
cover base with sauce
slice tomatoes 3
slice tomatoes 2
slice tomatoes 1
put tomatoes on pizza
grate cheese on pizza
to bake...4 min
to bake...3 min
to bake...2 min
to bake...1 min
Your pizza is ready!
     */
    public static void main(String[] args) throws InterruptedException {
        Pizza.cookPizza();
    }
}