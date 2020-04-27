import React,{Component} from 'react';

class ErrorBounderExample extends Component{
    constructor(props){
        super(props)
        this.state={hasError:false}
    }
    static getDrivedStateFromError(){
        return{
            hasError:true
        }
    }
    componentDidCatch(error,info){
        console.log(error)
        console.log(info)
    }

    render(){
        if(TimeRanges.state.hasError){
            return<h1>Something went wrong</h1>
        }
        return this.props.children
    }
}
export default ErrorBounderExample
