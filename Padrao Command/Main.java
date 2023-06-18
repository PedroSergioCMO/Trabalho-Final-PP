public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        // Criando comandos
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Configurando o invoker com os comandos
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);

        // Pressionando o botão do controle remoto
        remoteControl.pressButton();

        // Configurando o invoker com outro comando
        remoteControl.setCommand(turnOffCommand);

        // Pressionando o botão do controle remoto novamente
        remoteControl.pressButton();
    }
}
