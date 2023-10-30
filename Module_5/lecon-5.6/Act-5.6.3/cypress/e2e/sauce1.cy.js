it("Test Case 1 - Log in and log out", () => {
  cy.visit('https://www.saucedemo.com/')
  cy.get('[data-test="password"]').type('secret_sauce');
  cy.get('#user-name').type('error_user');
  cy.get('[data-test="login-button"]').click();
  cy.get('.title').should('have.text', 'Products');
  cy.get('#react-burger-menu-btn').click();
  cy.get('#logout_sidebar_link').click();
  cy.get('#login-button').should('be.visible');

});