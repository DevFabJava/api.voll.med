package med.voll.api.domain.paciente;

public record DadosListagemPaciente(Paciente paciente) {
    public DadosListagemPaciente(Paciente paciente) {
    this(paciente.getId(),paciente.getNome(),
            paciente.getEmail(),paciente.getCpf());
}
}
