package z0;

import C1.y;
import J2.InterfaceC0328z;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import c0.AbstractC0571K;
import java.util.function.Consumer;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11852l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f11853m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureSession f11854n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Rect f11855o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Consumer f11856p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436b(f fVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11853m = fVar;
        this.f11854n = scrollCaptureSession;
        this.f11855o = rect;
        this.f11856p = consumer;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1436b) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1436b(this.f11853m, this.f11854n, this.f11855o, this.f11856p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11852l;
        if (i2 == 0) {
            y.J(obj);
            ScrollCaptureSession scrollCaptureSession = this.f11854n;
            Rect rect = this.f11855o;
            O0.i iVar = new O0.i(rect.left, rect.top, rect.right, rect.bottom);
            this.f11852l = 1;
            obj = f.a(this.f11853m, scrollCaptureSession, iVar, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        this.f11856p.accept(AbstractC0571K.x((O0.i) obj));
        return C0880v.f8657a;
    }
}
