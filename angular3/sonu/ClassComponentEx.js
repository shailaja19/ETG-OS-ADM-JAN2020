import React,{Component} from 'react';
import  PropsExample from './PropsExample';

class ClassComponentEx extends Component{
    render(){
        return(
            <div>
                <h1>My Class Component</h1>
                <PropsExample name="Bhagya" age={23} >
                    <p> This is my Child Tag </p>
                </PropsExample>
                <PropsExample name= "Hampi"  age={22} weight={49}/>-->
            </div>
        )
    }
}

export default ClassComponentEx;