package Y;

import B.F;
import n0.C0933l;
import n2.AbstractC0946A;
import t0.o0;
import z2.i;
import z2.o;

/* loaded from: classes.dex */
public final class c extends i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6233i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f6234j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(F f3, d dVar, o oVar) {
        super(1);
        this.f6234j = oVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f6233i) {
            case 0:
                d dVar = (d) obj;
                if (!dVar.f5869t) {
                    return o0.f10611i;
                }
                if (!(dVar.f6236v == null)) {
                    AbstractC0946A.r("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    throw null;
                }
                dVar.f6236v = null;
                o oVar = this.f6234j;
                oVar.f11905h = oVar.f11905h;
                return o0.f10610h;
            default:
                if (!((C0933l) obj).f8952w) {
                    return o0.f10610h;
                }
                this.f6234j.f11905h = false;
                return o0.f10612j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar) {
        super(1);
        this.f6234j = oVar;
    }
}
