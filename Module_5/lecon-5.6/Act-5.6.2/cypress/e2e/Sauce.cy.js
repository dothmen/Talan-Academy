describe('template spec', () => {
  it('passes', () => {
    cy.visit('www.saucedemo.com')
    cy.get('body').type('problem_user')
    

  })
})