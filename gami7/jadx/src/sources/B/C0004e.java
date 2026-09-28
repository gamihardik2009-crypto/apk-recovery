package B;

import c0.C0565E;
import m2.C0880v;
import r0.InterfaceC1129r;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0004e extends z2.f implements y2.c {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f206p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(B b3) {
        super(1, z2.g.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f206p = b3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        float[] fArr = ((C0565E) obj).f7188a;
        InterfaceC1129r interfaceC1129r = (InterfaceC1129r) this.f206p.f145x.getValue();
        if (interfaceC1129r != null) {
            if (!interfaceC1129r.n()) {
                interfaceC1129r = null;
            }
            if (interfaceC1129r != null) {
                interfaceC1129r.r(fArr);
            }
        }
        return C0880v.f8657a;
    }
}
