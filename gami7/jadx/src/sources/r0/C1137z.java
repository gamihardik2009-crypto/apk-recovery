package r0;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137z implements InterfaceC1095I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1095I f9909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1090D f9910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1095I f9912e;

    public /* synthetic */ C1137z(InterfaceC1095I interfaceC1095I, C1090D c1090d, int i2, InterfaceC1095I interfaceC1095I2, int i3) {
        this.f9908a = i3;
        this.f9910c = c1090d;
        this.f9911d = i2;
        this.f9912e = interfaceC1095I2;
        this.f9909b = interfaceC1095I;
    }

    @Override // r0.InterfaceC1095I
    public final int f() {
        switch (this.f9908a) {
        }
        return this.f9909b.f();
    }

    @Override // r0.InterfaceC1095I
    public final int h() {
        switch (this.f9908a) {
        }
        return this.f9909b.h();
    }

    @Override // r0.InterfaceC1095I
    public final Map i() {
        switch (this.f9908a) {
        }
        return this.f9909b.i();
    }

    @Override // r0.InterfaceC1095I
    public final void j() {
        boolean z3;
        switch (this.f9908a) {
            case 0:
                int i2 = this.f9911d;
                C1090D c1090d = this.f9910c;
                c1090d.f9812l = i2;
                this.f9912e.j();
                Set entrySet = c1090d.f9818s.entrySet();
                z2.h.f(entrySet, "<this>");
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    InterfaceC1109X interfaceC1109X = (InterfaceC1109X) entry.getValue();
                    int j3 = c1090d.f9819t.j(key);
                    if (j3 < 0 || j3 >= c1090d.f9812l) {
                        interfaceC1109X.a();
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (Boolean.valueOf(z3).booleanValue()) {
                        it.remove();
                    }
                }
                break;
            default:
                C1090D c1090d2 = this.f9910c;
                c1090d2.f9811k = this.f9911d;
                this.f9912e.j();
                c1090d2.d(c1090d2.f9811k);
                break;
        }
    }

    @Override // r0.InterfaceC1095I
    public final y2.c k() {
        switch (this.f9908a) {
        }
        return this.f9909b.k();
    }
}
