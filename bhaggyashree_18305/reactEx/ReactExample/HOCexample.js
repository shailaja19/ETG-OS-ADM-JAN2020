class HOCExample extends React.Component {
    constructor(props) {
      super(props);
      this.handleChange = this.handleChange.bind(this);
      this.state = {
            cake: DataSource.getCake()
      };
    }
  
    componentDidMount() {
          DataSource.addChangeListener(this.handleChange);
    }
  
    componentWillUnmount() {
          DataSource.removeChangeListener(this.handleChange);
    }
  
    handleChange() {
      // Update component state whenever the data source changes
      this.setState({
        cake: DataSource.getCake()
      });
    }
  
    render() {
      return (
        <div>
          {this.state.cakes.map((cake) => (
            <HOCExample  cake={cake} key={cake.id} />
          ))}
        </div>
      );
    }
  }