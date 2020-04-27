import React from 'react';
import { render } from '@testing-library/react';

const UpdateComponent=(OriginalComponent)=>{
    class NewComponent extends React.Component{
        constructor(props){
            super(props)
            this.state={count:0}
        }
        incrementCount=()=>{
            this.setState(prevState=>{
                return{count:prevState.count+1}
            })
        }
            render(){
                return < OriginalComponent count = {this.state.count}incrementCount={this.incrementCount}> </OriginalComponent>
            }
    }
    
     return NewComponent
}
export default  UpdateComponent