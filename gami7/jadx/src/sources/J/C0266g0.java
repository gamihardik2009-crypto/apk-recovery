package J;

import T.AbstractC0379g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266g0 extends T.B implements Parcelable, T.p, InterfaceC0258c0, W0 {
    public static final Parcelable.Creator<C0266g0> CREATOR = new C0264f0(0);

    /* renamed from: i, reason: collision with root package name */
    public H0 f4140i;

    public C0266g0(float f3) {
        H0 h0 = new H0(f3);
        if (T.n.f5709a.d() != null) {
            H0 h02 = new H0(f3);
            h02.f5647a = 1;
            h0.f5648b = h02;
        }
        this.f4140i = h0;
    }

    @Override // T.A
    public final T.C a() {
        return this.f4140i;
    }

    @Override // T.A
    public final void b(T.C c3) {
        this.f4140i = (H0) c3;
    }

    @Override // T.p
    public final L0 c() {
        return W.f4109m;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // T.A
    public final T.C e(T.C c3, T.C c4, T.C c5) {
        if (((H0) c4).f4037c == ((H0) c5).f4037c) {
            return c4;
        }
        return null;
    }

    public final float g() {
        return ((H0) T.n.t(this.f4140i, this)).f4037c;
    }

    @Override // J.W0
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f3) {
        AbstractC0379g k3;
        H0 h0 = (H0) T.n.i(this.f4140i);
        if (h0.f4037c == f3) {
            return;
        }
        H0 h02 = this.f4140i;
        synchronized (T.n.f5710b) {
            k3 = T.n.k();
            ((H0) T.n.o(h02, this, k3, h0)).f4037c = f3;
        }
        T.n.n(k3, this);
    }

    @Override // J.InterfaceC0258c0
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((H0) T.n.i(this.f4140i)).f4037c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(g());
    }
}
