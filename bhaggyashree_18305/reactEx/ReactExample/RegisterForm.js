import React, {Component} from 'react';

class RegisterForm extends Component{
    constructor(props){
        console.log("component updated")
        super(props)
        this.state={userName:'',comments:'',topics:'react'}

    }
    handleUserName=(event)=>{
        this.setState({
            userName: event.target.value
        })
    }
        handleComments=(event)=>{
            this.setState({comments:event.target.value})
        }
        handleTopic=(event)=>{
            this.setState({
                topics:event.target.value})
        }
        handleSubmit=(event)=>{
            console.log(`${this.state.userName}`)
            event.preventDefault()
        }
        componentDidMount(){
            console.log("Component Mounted")
        }
    
        render(){
            return(
                <form onSubmit={this.handleSubmit}>
                <div>
                    userName:<input type='text' value={this.state.userName} onChange={this.handleUserName}/>
                </div>
                <div>
                Comments:<textarea  value={this.state.comments} onChange={this.handleComments}/>
                </div>
                <div>
                    Topics:
                    <select value ={this.state.topics} onChange={this.handleTopic}>
                        <option value='React'> React</option>
                        <option value='Angular'>Angular</option>
                        <option value='spring'>Spring</option>
                    </select>
                </div>
                <button type="submit">submit</button>
                </form>
            )
        }
    }

export default RegisterForm;