package r0;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1131t extends V.m {
    default int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 1, 2, 1), B1.C.c(i2, 0, 13)).h();
    }

    default int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 2, 2, 1), B1.C.c(i2, 0, 13)).h();
    }

    default int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 2, 1, 1), B1.C.c(0, i2, 7)).f();
    }

    InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3);

    default int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 1, 1, 1), B1.C.c(0, i2, 7)).f();
    }
}
