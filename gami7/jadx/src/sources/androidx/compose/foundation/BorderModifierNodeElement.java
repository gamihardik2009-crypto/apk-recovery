package androidx.compose.foundation;

import V.n;
import c0.AbstractC0598q;
import c0.InterfaceC0576P;
import n.C0910s;
import t0.S;
import z2.h;

/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends S {

    /* renamed from: b, reason: collision with root package name */
    public final float f6548b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0598q f6549c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0576P f6550d;

    public BorderModifierNodeElement(float f3, AbstractC0598q abstractC0598q, InterfaceC0576P interfaceC0576P) {
        this.f6548b = f3;
        this.f6549c = abstractC0598q;
        this.f6550d = interfaceC0576P;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return O0.e.a(this.f6548b, borderModifierNodeElement.f6548b) && h.a(this.f6549c, borderModifierNodeElement.f6549c) && h.a(this.f6550d, borderModifierNodeElement.f6550d);
    }

    public final int hashCode() {
        return this.f6550d.hashCode() + ((this.f6549c.hashCode() + (Float.hashCode(this.f6548b) * 31)) * 31);
    }

    @Override // t0.S
    public final n l() {
        return new C0910s(this.f6548b, this.f6549c, this.f6550d);
    }

    @Override // t0.S
    public final void m(n nVar) {
        C0910s c0910s = (C0910s) nVar;
        float f3 = c0910s.f8845x;
        float f4 = this.f6548b;
        boolean a3 = O0.e.a(f3, f4);
        Z.b bVar = c0910s.f8843A;
        if (!a3) {
            c0910s.f8845x = f4;
            bVar.K0();
        }
        AbstractC0598q abstractC0598q = c0910s.f8846y;
        AbstractC0598q abstractC0598q2 = this.f6549c;
        if (!h.a(abstractC0598q, abstractC0598q2)) {
            c0910s.f8846y = abstractC0598q2;
            bVar.K0();
        }
        InterfaceC0576P interfaceC0576P = c0910s.f8847z;
        InterfaceC0576P interfaceC0576P2 = this.f6550d;
        if (h.a(interfaceC0576P, interfaceC0576P2)) {
            return;
        }
        c0910s.f8847z = interfaceC0576P2;
        bVar.K0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) O0.e.b(this.f6548b)) + ", brush=" + this.f6549c + ", shape=" + this.f6550d + ')';
    }
}
