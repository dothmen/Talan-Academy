describe('template spec', () => {
  it('passes', () => {
    cy.visit('http://demo.guru99.com/test/newtours/')
    cy.get('[width="67"] > a').click()
    cy.get(':nth-child(1) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('dorsafothmen12@gmail.com')
    cy.get(':nth-child(2) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Dodo27948.!')
    cy.get(':nth-child(4) > td > input').click();

  })
})