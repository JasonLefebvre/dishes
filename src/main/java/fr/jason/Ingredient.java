package fr.jason;


public class Ingredient implements Kitchen{

        private String name;
        private State state;
        private String unit;
        private Integer quantity;

        public Ingredient(String name, State state, String unit, Integer quantity){
            this.name = name;
            this.state = state;
            this.unit = unit;
            this.quantity = quantity;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Ingredient i)){
                return false;
            }
            return i.name.equals(this.name) && i.state == this.state;
        }

        @Override
        public void cook(){
            try {
                if (this.getState() == State.RAW){
                    this.setState(State.COOKED);
                } else if (this.getState() == State.COOKED) {
                    System.out.println("Is already cook");
                } else {
                    throw new StateException(this, this.getState());
                }
            } catch (StateException e){
                e.printStackTrace();
            }
        }

        @Override
        public void cut() {
            try {
                if (this.getState() == State.WHOLE){
                    this.setState(State.CUT);
                } else if (this.getState() == State.CUT) {
                    System.out.println("Is already cut");
                } else {
                    throw new StateException(this, this.getState());
                }
            } catch (StateException e){
                e.printStackTrace();
            }
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
}
