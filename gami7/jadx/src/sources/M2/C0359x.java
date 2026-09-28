package M2;

import N2.C0362a;
import q2.InterfaceC1073d;

/* renamed from: M2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359x implements InterfaceC0344h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.s f4936i;

    public /* synthetic */ C0359x(z2.s sVar, int i2) {
        this.f4935h = i2;
        this.f4936i = sVar;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        switch (this.f4935h) {
            case 0:
                this.f4936i.f11909h = obj;
                throw new C0362a(this);
            default:
                this.f4936i.f11909h = obj;
                throw new C0362a(this);
        }
    }
}
