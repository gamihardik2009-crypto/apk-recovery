package s2;

import J2.C0311h;
import O2.AbstractC0369a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.C1074e;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import q2.InterfaceC1078i;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1198c extends AbstractC1196a {

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1078i f10205i;

    /* renamed from: j, reason: collision with root package name */
    public transient InterfaceC1073d f10206j;

    public AbstractC1198c(InterfaceC1073d interfaceC1073d, InterfaceC1078i interfaceC1078i) {
        super(interfaceC1073d);
        this.f10205i = interfaceC1078i;
    }

    @Override // q2.InterfaceC1073d
    public InterfaceC1078i n() {
        InterfaceC1078i interfaceC1078i = this.f10205i;
        z2.h.c(interfaceC1078i);
        return interfaceC1078i;
    }

    @Override // s2.AbstractC1196a
    public void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1073d interfaceC1073d = this.f10206j;
        if (interfaceC1073d != null && interfaceC1073d != this) {
            InterfaceC1076g s3 = n().s(C1074e.f9782h);
            z2.h.c(s3);
            O2.h hVar = (O2.h) interfaceC1073d;
            do {
                atomicReferenceFieldUpdater = O2.h.f5178o;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0369a.f5168d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0311h c0311h = obj instanceof C0311h ? (C0311h) obj : null;
            if (c0311h != null) {
                c0311h.m();
            }
        }
        this.f10206j = C1197b.f10204h;
    }

    public AbstractC1198c(InterfaceC1073d interfaceC1073d) {
        this(interfaceC1073d, interfaceC1073d != null ? interfaceC1073d.n() : null);
    }
}
