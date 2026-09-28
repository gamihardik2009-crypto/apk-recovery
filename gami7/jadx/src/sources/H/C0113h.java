package H;

import java.util.ArrayList;
import n2.AbstractC0961m;
import r0.InterfaceC1094H;
import r0.InterfaceC1096J;

/* renamed from: H.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113h implements InterfaceC1094H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2634b;

    public C0113h(float f3, float f4) {
        this.f2633a = f3;
        this.f2634b = f4;
    }

    public static final void b(ArrayList arrayList, z2.q qVar, InterfaceC1096J interfaceC1096J, float f3, ArrayList arrayList2, ArrayList arrayList3, z2.q qVar2, ArrayList arrayList4, z2.q qVar3, z2.q qVar4) {
        if (!arrayList.isEmpty()) {
            qVar.f11907h = interfaceC1096J.l(f3) + qVar.f11907h;
        }
        arrayList.add(0, AbstractC0961m.X(arrayList2));
        arrayList3.add(Integer.valueOf(qVar2.f11907h));
        arrayList4.add(Integer.valueOf(qVar.f11907h));
        qVar.f11907h += qVar2.f11907h;
        qVar3.f11907h = Math.max(qVar3.f11907h, qVar4.f11907h);
        arrayList2.clear();
        qVar4.f11907h = 0;
        qVar2.f11907h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3 A[SYNTHETIC] */
    @Override // r0.InterfaceC1094H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r0.InterfaceC1095I f(r0.InterfaceC1096J r25, java.util.List r26, long r27) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0113h.f(r0.J, java.util.List, long):r0.I");
    }
}
