package J;

import T.AbstractC0379g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: J.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270i0 extends T.B implements Parcelable, T.p, InterfaceC0258c0, W0 {
    public static final Parcelable.Creator<C0270i0> CREATOR = new C0264f0(2);

    /* renamed from: i, reason: collision with root package name */
    public J0 f4146i;

    public C0270i0(long j3) {
        J0 j02 = new J0(j3);
        if (T.n.f5709a.d() != null) {
            J0 j03 = new J0(j3);
            j03.f5647a = 1;
            j02.f5648b = j03;
        }
        this.f4146i = j02;
    }

    @Override // T.A
    public final T.C a() {
        return this.f4146i;
    }

    @Override // T.A
    public final void b(T.C c3) {
        this.f4146i = (J0) c3;
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
        if (((J0) c4).f4040c == ((J0) c5).f4040c) {
            return c4;
        }
        return null;
    }

    public final void g(long j3) {
        AbstractC0379g k3;
        J0 j02 = (J0) T.n.i(this.f4146i);
        if (j02.f4040c != j3) {
            J0 j03 = this.f4146i;
            synchronized (T.n.f5710b) {
                k3 = T.n.k();
                ((J0) T.n.o(j03, this, k3, j02)).f4040c = j3;
            }
            T.n.n(k3, this);
        }
    }

    @Override // J.W0
    public Object getValue() {
        return Long.valueOf(((J0) T.n.t(this.f4146i, this)).f4040c);
    }

    @Override // J.InterfaceC0258c0
    public void setValue(Object obj) {
        g(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((J0) T.n.i(this.f4146i)).f4040c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(((J0) T.n.t(this.f4146i, this)).f4040c);
    }
}
