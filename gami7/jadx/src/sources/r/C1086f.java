package r;

import J.InterfaceC0258c0;
import M2.InterfaceC0344h;
import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import q2.InterfaceC1073d;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086f implements InterfaceC0344h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f9791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f9792j;

    public /* synthetic */ C1086f(ArrayList arrayList, InterfaceC0258c0 interfaceC0258c0, int i2) {
        this.f9790h = i2;
        this.f9791i = arrayList;
        this.f9792j = interfaceC0258c0;
    }

    @Override // M2.InterfaceC0344h
    public final Object f(Object obj, InterfaceC1073d interfaceC1073d) {
        switch (this.f9790h) {
            case 0:
                j jVar = (j) obj;
                boolean z3 = jVar instanceof C1084d;
                List list = this.f9791i;
                if (z3) {
                    list.add(jVar);
                } else if (jVar instanceof C1085e) {
                    list.remove(((C1085e) jVar).f9789a);
                }
                this.f9792j.setValue(Boolean.valueOf(!list.isEmpty()));
                break;
            default:
                j jVar2 = (j) obj;
                boolean z4 = jVar2 instanceof n;
                List list2 = this.f9791i;
                if (z4) {
                    list2.add(jVar2);
                } else if (jVar2 instanceof o) {
                    list2.remove(((o) jVar2).f9800a);
                } else if (jVar2 instanceof m) {
                    list2.remove(((m) jVar2).f9798a);
                }
                this.f9792j.setValue(Boolean.valueOf(!list2.isEmpty()));
                break;
        }
        return C0880v.f8657a;
    }
}
