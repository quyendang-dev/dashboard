import React, { Component } from "react";
import { withRouter } from "react-router-dom";
import "./AppHeader.css";
import { Layout, Row, Col, Button } from "antd";
const Header = Layout.Header;

class AppHeader extends Component {

  render() {
    let isAuthenticated = this.props.isAuthenticated;
    return isAuthenticated ? (
      <Header key="header" className="app-header">
        <Layout className="ant-layout-header">
          <Row>
            <Col span={3} offset={21} style={{color: "white", fontSize: 18}}>
              Wellcome, {this.props.currentUser.username}
            </Col>
          </Row>
          <Row>
            <Col span={3} offset={21}>
              <Button
                className="logout-button"
                type="ghost"
                onClick={this.props.onLogout}
              >
                Logout
              </Button>
            </Col>
          </Row>
        </Layout>
      </Header>
    ) : null;
  }
}

export default withRouter(AppHeader);
