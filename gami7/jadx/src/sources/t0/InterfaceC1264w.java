package t0;

import r0.C1123l;
import r0.C1128q;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;

/* renamed from: t0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1264w extends InterfaceC1255m {
    default int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 1, 2, 2), B1.C.c(i2, 0, 13)).h();
    }

    default int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int i3 = 2;
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, i3, i3, 2), B1.C.c(i2, 0, 13)).h();
    }

    default int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, 2, 1, 2), B1.C.c(0, i2, 7)).f();
    }

    InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3);

    default int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        int i3 = 1;
        return f(new C1128q(interfaceC1126o, interfaceC1126o.getLayoutDirection()), new C1123l(interfaceC1093G, i3, i3, 2), B1.C.c(0, i2, 7)).f();
    }
}
